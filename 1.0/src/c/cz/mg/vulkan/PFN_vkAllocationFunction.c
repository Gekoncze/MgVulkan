#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_PFNvkAllocationFunction_callNative(JNIEnv* env, jclass jc, jlong address, jlong pUserData, jlong size, jlong alignment, jint allocationScope){
    (void)env;
    (void)jc;
    PFN_vkAllocationFunction f = (PFN_vkAllocationFunction)jniLongToFunctionPointer(address);
    return jniPointerToLong(f(
        ((void*)jniLongToPointer(pUserData)),
        (size_t)size,
        (size_t)alignment,
        (VkSystemAllocationScope)allocationScope
    ));
}

