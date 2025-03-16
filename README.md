# Spring-Practice
______Spring Framework____________

Primitive Types:

<property name ="">
<value> value</value>
</property>
<property name = "" value = ""/>
<bean p:property:Value />

___________________________________________

## Collection Types:

## 1. List 
<bean>
<property name="" >
<list>
<value> 10</value>
<value>1023</value>
<value>12350</value>
<value>1052</value>
<null/>
</list>

</property>
<bean>

__________________________________________
## 2. Set

<bean>
<property name ="">
<set>
<value> 10</value>
<value>1023</value>
<value>12350</value>
<value>1052</value>
</set>
</property>
</bean>


_________________________________________________

## 3. Map

<bean> 
<property name ="">
<map>
<entry key ="java" value = "2month"/>
<entry key ="python" value = "3month"/>

</map>
</property>
</bean>
______________________________________________

## 4.Property 

<bean>
<property name ="">
<props>
<prop key ="name"> geetanjali</prop>
<prop key ="channelName">Learncodingin spring</prop>
</props>
</property>
</bean>
__________________________

*************************************************

## 5. Reference Type:

A

Reference Injection : 

B

<bean>
	<property name= "">
	<ref value ="b">
</property>
</bean>

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

## life cycle methods

Spring provide two important methods to every bean 
1) public void init()
2) public void destroy()


