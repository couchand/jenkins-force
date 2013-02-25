package org.jenkinsci.plugins.jenkins_force;
import hudson.util.Secret;

/**
 * Details of a Force.com user with password.
 */
public interface ForceDotComUserPassword extends ForceDotComUser
{
    Secret getPassword();
}
