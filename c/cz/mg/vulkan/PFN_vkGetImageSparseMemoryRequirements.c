#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkGetImageSparseMemoryRequirements_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong image, jlong pSparseMemoryRequirementCount, jlong pSparseMemoryRequirements){
    (void)env;
    (void)jc;
    PFN_vkGetImageSparseMemoryRequirements f = (PFN_vkGetImageSparseMemoryRequirements)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkImage*)jniLongToPointer(image)),
        ((uint32_t*)jniLongToPointer(pSparseMemoryRequirementCount)),
        ((VkSparseImageMemoryRequirements*)jniLongToPointer(pSparseMemoryRequirements))
    );
}
