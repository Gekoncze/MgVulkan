#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkInternalAllocationNotification_callNative(JNIEnv* env, jclass jc, jlong address, jlong pUserData, jlong size, jint allocationType, jint allocationScope){
    (void)env;
    (void)jc;
    PFN_vkInternalAllocationNotification f = (PFN_vkInternalAllocationNotification)jniLongToFunctionPointer(address);
    f(
        ((void*)jniLongToPointer(pUserData)),
        (size_t)size,
        (VkInternalAllocationType)allocationType,
        (VkSystemAllocationScope)allocationScope
    );
}

