export class User {
    public login?: string;
    public id?: string;
    public avatar_url?: string;
    public url?: string;
    public followers_url?: string;
    public email?: string;
    public followers?: User[];
    public total_commits?:number;
    public repos_commits?:number;

}