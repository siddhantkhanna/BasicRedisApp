# Simple Jedis Implementation for Redis cache

This is a simple spring boot app with a simple redis cache implementation using jedis.<br/>
You can run the app using the main function in BasicRedisAppApplication.java.<br/>
It has a getData url which shows some data from a json file and prints it on the screen.<br/>
If it is not available in the cache it initialises the cache with this data.<br/>
