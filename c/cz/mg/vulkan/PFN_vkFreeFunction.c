#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkFreeFunction_call(JNIEnv* env, jclass jc, jlong address, jlong pUserData, jlong pMemory){
    (void)env;
    (void)jc;
    PFN_vkFreeFunction f = (PFN_vkFreeFunction)jniLongToFunctionPointer(address);
    f(
        ((void*)jniLongToPointer(pUserData)),
        ((void*)jniLongToPointer(pMemory))
    );
}
