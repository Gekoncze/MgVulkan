#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassMultiviewCreateInfoKHX);
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getSubpassCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setSubpassCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassCount, valuePointer, sizeof(o->subpassCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getPViewMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setPViewMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewMasks, &valuePointer, sizeof(o->pViewMasks));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getDependencyCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setDependencyCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyCount, valuePointer, sizeof(o->dependencyCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getPViewOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewOffsets);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setPViewOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewOffsets, &valuePointer, sizeof(o->pViewOffsets));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->correlationMaskCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setCorrelationMaskCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->correlationMaskCount, valuePointer, sizeof(o->correlationMaskCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_getPCorrelationMasks(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pCorrelationMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfoKHX_setPCorrelationMasks(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfoKHX* o = (VkRenderPassMultiviewCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCorrelationMasks, &valuePointer, sizeof(o->pCorrelationMasks));
}


