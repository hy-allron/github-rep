我们在使用Redis的分布式锁的时候，大家都知道是依靠了setnx的指令，在CAS（Compare and swap）的操作的时候，同时给指定的key设置了过期实践（expire），我们在限流的主要目的就是为了在单位时间内，有且仅有N数量的请求能够访问我的代码程序。所以依靠setnx可以很轻松的做到这方面的功能。

     比如我们需要在10秒内限定20个请求，那么我们在setnx的时候可以设置过期时间10，当请求的setnx数量达到20时候即达到了限流效果。代码比较简单就不做展示了。

    具体的setnx用法可以参照我另一篇博客  RedisTemplate下Redis分布式锁引发的系列问题

当然这种做法的弊端是很多的，比如当统计1-10秒的时候，无法统计2-11秒之内，如果需要统计N秒内的M个请求，那么我们的Redis中需要保持N个key等等问题
————————————————
版权声明：本文为CSDN博主「Leonis丶L」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/lmx125254/article/details/90700118