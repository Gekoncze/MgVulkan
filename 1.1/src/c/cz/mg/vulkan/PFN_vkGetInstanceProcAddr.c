#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_PFNvkGetInstanceProcAddr_callNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong pName){
    (void)env;
    (void)jc;
    PFN_vkGetInstanceProcAddr f = (PFN_vkGetInstanceProcAddr)jniLongToFunctionPointer(address);
    return jniFunctionPointerToLong(f(
        *((VkInstance*)jniLongToPointer(instance)),
        ((char*)jniLongToPointer(pName))
    ));
}

