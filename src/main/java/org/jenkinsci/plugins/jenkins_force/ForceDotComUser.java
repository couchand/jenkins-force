package org.jenkinsci.plugins.jenkins_force;
import com.cloudbees.plugins.credentials.Credentials;

/**
 * Details of a Force.com user.
 */
public interface ForceDotComUser extends Credentials
{
    String getUsername();
    String getDescription();
    String getId();
    String getEnv();
}
