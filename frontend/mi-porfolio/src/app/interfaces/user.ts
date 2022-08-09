export type Roles = 'ADMIN' | 'VISITOR';

export interface User {
    
    emailUser: string;
    password: string

}
export interface UserResponse {
    message: string;
    token: string;
    userId: string;
    role: Roles;
}
