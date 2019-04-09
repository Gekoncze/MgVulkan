#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdBlitImage_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcImage, jlong srcImageLayout, jlong dstImage, jlong dstImageLayout, jlong regionCount, jlong pRegions, jlong filter){
    (void)env;
    (void)jc;
    PFN_vkCmdBlitImage f = (PFN_vkCmdBlitImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(srcImage)),
        *((VkImageLayout*)jniLongToPointer(srcImageLayout)),
        *((VkImage*)jniLongToPointer(dstImage)),
        *((VkImageLayout*)jniLongToPointer(dstImageLayout)),
        *((uint32_t*)jniLongToPointer(regionCount)),
        ((VkImageBlit*)jniLongToPointer(pRegions)),
        *((VkFilter*)jniLongToPointer(filter))
    );
}
