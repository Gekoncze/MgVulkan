#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCommandBufferInheritanceInfo);
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getRenderPassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderPass);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setRenderPassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderPass, valuePointer, sizeof(o->renderPass));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getSubpassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpass);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setSubpassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpass, valuePointer, sizeof(o->subpass));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getFramebufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebuffer);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setFramebufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebuffer, valuePointer, sizeof(o->framebuffer));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getOcclusionQueryEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->occlusionQueryEnable);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setOcclusionQueryEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->occlusionQueryEnable, valuePointer, sizeof(o->occlusionQueryEnable));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getQueryFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queryFlags);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setQueryFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queryFlags, valuePointer, sizeof(o->queryFlags));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getPipelineStatisticsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineStatistics);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setPipelineStatisticsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineStatistics, valuePointer, sizeof(o->pipelineStatistics));
}


