#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_PFNvkGetDeviceProcAddr_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pName){
    (void)env;
    (void)jc;
    PFN_vkGetDeviceProcAddr f = (PFN_vkGetDeviceProcAddr)jniLongToFunctionPointer(address);
    return jniFunctionPointerToLong(f(
        *((VkDevice*)jniLongToPointer(device)),
        ((char*)jniLongToPointer(pName))
    ));
}

