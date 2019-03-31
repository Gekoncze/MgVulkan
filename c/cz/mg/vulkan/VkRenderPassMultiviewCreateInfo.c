#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassMultiviewCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getSubpassCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subpassCount));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setSubpassCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->subpassCount, jniLongToPointer(valueAddress), sizeof(o->subpassCount));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getPViewMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewMasks));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setPViewMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pViewMasks, jniLongToPointer(valueAddress), sizeof(o->pViewMasks));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getDependencyCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dependencyCount));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setDependencyCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->dependencyCount, jniLongToPointer(valueAddress), sizeof(o->dependencyCount));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getPViewOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewOffsets));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setPViewOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pViewOffsets, jniLongToPointer(valueAddress), sizeof(o->pViewOffsets));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->correlationMaskCount));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->correlationMaskCount, jniLongToPointer(valueAddress), sizeof(o->correlationMaskCount));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_getPCorrelationMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pCorrelationMasks));
}

void Java_cz_mg_vulkan_vk_VkRenderPassMultiviewCreateInfo_setPCorrelationMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pCorrelationMasks, jniLongToPointer(valueAddress), sizeof(o->pCorrelationMasks));
}

