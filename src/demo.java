dd
public class demo {
	public static void main(String[] args) {
	  String  aa="123";
	  String ll="aa";
	  String  gitUrl="";
	  String  buildPeriodically="";
	  String  pollSCM="";
	  String antBuildFileName="";
	  String command="";
	  String xmlJob="";
	  xmlJob+="<project>";
	  xmlJob+="<actions/>";
	  xmlJob+="<description/>";
	  xmlJob+="<keepDependencies>false</keepDependencies>";
	  xmlJob+="<properties/>";
      xmlJob+="<scm class=\"hudson.plugins.git.GitSCM\" plugin=\"git@2.6.0\">";
	  xmlJob+="<configVersion>2</configVersion>";
	  xmlJob+=" <userRemoteConfigs>";
	  xmlJob+="<hudson.plugins.git.UserRemoteConfig>";
	  xmlJob+="<url>"+gitUrl+"</url>";
	  xmlJob+="</hudson.plugins.git.UserRemoteConfig>";
	  xmlJob+="</userRemoteConfigs>";
	  xmlJob+="<branches>";
	  xmlJob+="<hudson.plugins.git.BranchSpec>";
	  xmlJob+="<name>*/master</name>";																												  
	  xmlJob+="</hudson.plugins.git.BranchSpec>";
	  xmlJob+="</branches>";
	  xmlJob+="<doGenerateSubmoduleConfigurations>false</doGenerateSubmoduleConfigurations>";
	  xmlJob+="<submoduleCfg class=\"list\"/>";
	  xmlJob+="<extensions/>";
	  xmlJob+="</scm>";
	  xmlJob+="<canRoam>true</canRoam>";
	  xmlJob+="<disabled>false</disabled>";
	  xmlJob+="<blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>";
	  xmlJob+="<blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>";
	  xmlJob+="<triggers>";
	  xmlJob+="<hudson.triggers.TimerTrigger>";
	  xmlJob+="<spec>"+buildPeriodically+"</spec>";
	  xmlJob+="</hudson.triggers.TimerTrigger>";
	  xmlJob+="<hudson.triggers.SCMTrigger>";
	  xmlJob+="<spec>"+pollSCM+"</spec>";
	  xmlJob+="<ignorePostCommitHooks>false</ignorePostCommitHooks>";
	  xmlJob+="</hudson.triggers.SCMTrigger>";
	  xmlJob+="</triggers>";
	  xmlJob+="<concurrentBuild>false</concurrentBuild>";
	  xmlJob+="<builders>";
	  xmlJob+="<hudson.tasks.Ant plugin=\"ant@1.4\">";
	  xmlJob+="<targets/>";
	  xmlJob+="<buildFile>build.xml</buildFile>";
	  xmlJob+="</hudson.tasks.Ant>";
	  xmlJob+="<hudson.tasks.Shell>";
	  xmlJob+="<command>"+command+"</command>";
	  xmlJob+="</hudson.tasks.Shell>";
	  xmlJob+="</builders>";
	  xmlJob+="<publishers/>";
	  xmlJob+="<buildWrappers/>";
	  xmlJob+="</project>";
}
}
