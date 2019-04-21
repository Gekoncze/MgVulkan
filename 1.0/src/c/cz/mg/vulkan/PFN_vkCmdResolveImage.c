#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdResolveImage_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong srcImage, jlong srcImageLayout, jlong dstImage, jlong dstImageLayout, jlong regionCount, jlong pRegions){
    (void)env;
    (void)jc;
    PFN_vkCmdResolveImage f = (PFN_vkCmdResolveImage)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        *((VkImage*)jniLongToPointer(srcImage)),
        *((VkImageLayout*)jniLongToPointer(srcImageLayout)),
        *((VkImage*)jniLongToPointer(dstImage)),
        *((VkImageLayout*)jniLongToPointer(dstImageLayout)),
        *((uint32_t*)jniLongToPointer(regionCount)),
        ((VkImageResolve*)jniLongToPointer(pRegions))
    );
}
