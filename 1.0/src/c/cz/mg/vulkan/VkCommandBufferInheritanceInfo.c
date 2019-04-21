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

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getRenderPass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderPass);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setRenderPass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderPass, valuePointer, sizeof(o->renderPass));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getSubpass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpass);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setSubpass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpass, valuePointer, sizeof(o->subpass));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getFramebuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebuffer);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setFramebuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebuffer, valuePointer, sizeof(o->framebuffer));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getOcclusionQueryEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->occlusionQueryEnable);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setOcclusionQueryEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->occlusionQueryEnable, valuePointer, sizeof(o->occlusionQueryEnable));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getQueryFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queryFlags);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setQueryFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queryFlags, valuePointer, sizeof(o->queryFlags));
}

jlong Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_getPipelineStatistics(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineStatistics);
}

void Java_cz_mg_vulkan_VkCommandBufferInheritanceInfo_setPipelineStatistics(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferInheritanceInfo* o = (VkCommandBufferInheritanceInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineStatistics, valuePointer, sizeof(o->pipelineStatistics));
}


