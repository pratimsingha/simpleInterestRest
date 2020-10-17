A rest service that takes Principal, rate and time as an input
and apply the simple interest formualae and provides the result as an output.

End point: /si/{principal:.+}/{rate:.+}/{time:.+}
Example: http://localhost:8082/simpleinterest/restService/si/2000.50/5.5/5.3