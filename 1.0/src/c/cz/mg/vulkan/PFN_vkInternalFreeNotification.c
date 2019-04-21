#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkInternalFreeNotification_call(JNIEnv* env, jclass jc, jlong address, jlong pUserData, jlong size, jlong allocationType, jlong allocationScope){
    (void)env;
    (void)jc;
    PFN_vkInternalFreeNotification f = (PFN_vkInternalFreeNotification)jniLongToFunctionPointer(address);
    f(
        ((void*)jniLongToPointer(pUserData)),
        *((size_t*)jniLongToPointer(size)),
        *((VkInternalAllocationType*)jniLongToPointer(allocationType)),
        *((VkSystemAllocationScope*)jniLongToPointer(allocationScope))
    );
}
