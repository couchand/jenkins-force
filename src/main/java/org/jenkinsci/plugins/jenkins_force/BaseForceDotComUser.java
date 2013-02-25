package org.jenkinsci.plugins.jenkins_force;
import org.jenkinsci.plugins.jenkins_force.ForceDotComUser;
import com.cloudbees.plugins.credentials.BaseCredentials;
import com.cloudbees.plugins.credentials.CredentialsScope;

import org.apache.commons.lang.StringUtils;
import java.util.UUID;

/**
 * Details of a Force.com user.
 */
public class BaseForceDotComUser extends BaseCredentials implements ForceDotComUser
{
    private static final long serialVersionUID = 1L;

    protected final String id;
    protected final String username;
    protected final String env;
    protected final String description;

    public BaseForceDotComUser( CredentialsScope scope, String id, String username, String env, String description )
    {
        super( scope );
        this.id = StringUtils.isEmpty(id) ? UUID.randomUUID().toString() : id;
        this.username = username;
        this.env = env;
        this.description = description;
    }

    public String getId()
    {
        return id;
    }

    public String getUsername()
    {
        return StringUtils.isEmpty( username ) ? System.getProperty("user.name") : username;
    }

    public String getEnv()
    {
        return StringUtils.isNotEmpty( env ) ? env : "test";
    }

    public String getDescription()
    {
        return StringUtils.isNotEmpty( description ) ? description : "";
    }
}
