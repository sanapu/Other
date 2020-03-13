package test.gitcommitobject;

/*
 *
 *reference link: http://shafiul.github.io/gitbook/1_the_git_object_model.html
 *
 *The GitCommitObject class is a simplified immutable Objec
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author sravanisanapureddy
 *
 */
public final class GitCommitObject {

    //The SHA1 name of a tree object
    private final String treeHash;

    //The SHA1 name of some number of commits which represent the immediately previous step(s)
    //in the history of the project.(only if the project has a parent/root )
    private final List<String> parentHash = new ArrayList<String>();

    //The name of the person responsible for this change
    private final Person author;

    //The name of the person who actually created the commit
    private final Person committer;


    GitCommitObject(String treeHash, String name, String timestamp, String email){
        this.treeHash = treeHash;

        Person author = new Person(name,timestamp,email);
        this.author = author;
        Person commiter = new Person(name,timestamp,email);
        this.committer = commiter;

    }


    /**
     * @return the treeHash
     */
    public String getTreeHash() {
        return treeHash;
    }


    public boolean equals(Object objectInst) {
        if (objectInst == null)
            return false;

        if (!(objectInst instanceof GitCommitObject)) {
            return false;
        }

        GitCommitObject gitCommitObject = (GitCommitObject) objectInst;

        if (!(treeHash.equals(gitCommitObject.treeHash))) {
            return false;
        }
//        if (!(parentHash.equals(gitCommitObject.parentHash))) {
//            return false;
//        }
        if (!(author.equals(gitCommitObject.author))) {
            return false;
        }
        if (!(committer.equals(gitCommitObject.committer))) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        StringBuilder stringBuilder = new StringBuilder();

        if (!parentHash.isEmpty()) {
            stringBuilder.append(treeHash);


        } else
            stringBuilder.append(treeHash).append(author).append(committer);

        return stringBuilder.toString().hashCode();
    }

    private class Person {
        public String name;
        public String timestamp;
        public String email;

        public Person(String name, String timestamp, String email) {
            this.name = name;
            this.timestamp = timestamp;
            this.email = email;
        }

        public String concatenated() {
            return name + timestamp + email;
        }
    }

}
