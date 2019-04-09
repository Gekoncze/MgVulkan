#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassMultiviewCreateInfo);
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getSubpassCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setSubpassCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassCount, valuePointer, sizeof(o->subpassCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPViewMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPViewMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewMasks, &valuePointer, sizeof(o->pViewMasks));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getDependencyCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setDependencyCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyCount, valuePointer, sizeof(o->dependencyCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPViewOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewOffsets);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPViewOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewOffsets, &valuePointer, sizeof(o->pViewOffsets));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->correlationMaskCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->correlationMaskCount, valuePointer, sizeof(o->correlationMaskCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPCorrelationMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pCorrelationMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPCorrelationMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCorrelationMasks, &valuePointer, sizeof(o->pCorrelationMasks));
}


