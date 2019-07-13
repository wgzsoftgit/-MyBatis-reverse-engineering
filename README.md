lvyou3zidong\config配置信息
<generatorConfiguration>
	<!-- classPathEntry:数据库的JDBC驱动的jar包地址 -->
	<classPathEntry
		location="D:\自己项目真实存储路径\lvyou3zidong\lib\mysql-connector-java-5.1.28-bin.jar" />
	<context id="caigouTables" targetRuntime="MyBatis3">
		<commentGenerator>
			<!-- 是否去除自动生成的注释 true：是 ： false:否 -->
			<property name="suppressAllComments" value="true" />
		</commentGenerator>
		<!--数据库连接的信息：驱动类、连接地址、用户名、密码 -->
		<jdbcConnection driverClass="com.mysql.jdbc.Driver"
			connectionURL="jdbc:mysql://localhost:3306/my_lvyou" userId="Root"
			password="123456">
		</jdbcConnection>
		<!-- <jdbcConnection driverClass="oracle.jdbc.OracleDriver"
			connectionURL="jdbc:oracle:thin:@127.0.0.1:1521:yycg" 
			userId="yycg"
			password="yycg">
		</jdbcConnection> -->

		<!-- 默认false，把JDBC DECIMAL 和 NUMERIC 类型解析为 Integer true，把JDBC DECIMAL 和 
			NUMERIC 类型解析为java.math.BigDecimal -->
		<javaTypeResolver>
			<property name="forceBigDecimals" value="false" />
		</javaTypeResolver>

		<!-- targetProject:生成PO类的位置 -->
		<javaModelGenerator targetPackage="ly.base.po.domain"
			targetProject=".\src">
			<!-- enableSubPackages:是否让schema作为包的后缀 -->
			<property name="enableSubPackages" value="true" />
			<!-- 从数据库返回的值被清理前后的空格 -->
			<property name="trimStrings" value="true" />
		</javaModelGenerator>
        <!-- targetProject:自动mapper的位置 -->
		<sqlMapGenerator targetPackage="ly.base.dao.mapper" 
			targetProject=".\src">
			<property name="enableSubPackages" value="false" />
		</sqlMapGenerator>

		<javaClientGenerator type="XMLMAPPER"
			targetPackage="ly.base.dao.mapper" implementationPackage="ly.base.dao.mapper"
			targetProject=".\src">
			<property name="enableSubPackages" value="false" />
		</javaClientGenerator>
		  <!-- tableName数据表名 -->
		<table schema="yycg" tableName="user" ></table>
		<table schema="yycg" tableName="activity" ></table>
		<table schema="yycg" tableName="scenic" ></table>
		<table schema="yycg" tableName="video" ></table>
		<table schema="yycg" tableName="message" ></table>
		<table schema="yycg" tableName="ways" >
		</table>
	</context>
</generatorConfiguration>
