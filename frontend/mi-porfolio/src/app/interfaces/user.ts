export type Roles = 'ADMIN' | 'VISITOR';

export interface About {
    titleUser: string;
    name: string;
    lastName: string;
    descriptionUser: string;
    //imageUser: string;
}
export class UserLogin {
    
    nameUser: string;
    password: string
    constructor(u:string, p:string) {
        this.nameUser = u;
        this.password = p;
    }
   

}
export class UserResponse {
    message: string;
    token: string;
    userName: string;
    authorities: string[] ;
    constructor(m:string, t:string, u:string, a:string[]) {
        this.message = m;
        this.token = t;
        this.userName = u;
        this.authorities = a;
    }
}
