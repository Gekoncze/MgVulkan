#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetImageSparseMemoryRequirements2KHR_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pInfo, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements){
    (void)env;
    (void)jc;
    PFN_vkGetImageSparseMemoryRequirements2KHR f = (PFN_vkGetImageSparseMemoryRequirements2KHR)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkImageSparseMemoryRequirementsInfo2*)jniLongToPointer(pInfo)),
        ((uint32_t*)jniLongToPointer(pSparseMemoryRequirementCount)),
        ((VkSparseImageMemoryRequirements2*)jniLongToPointer(pSparseMemoryRequirements))
    );
}
