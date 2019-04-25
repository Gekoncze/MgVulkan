#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDepthStencilStateCreateInfo);
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthTestEnable);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setDepthTestEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthTestEnable, valuePointer, sizeof(o->depthTestEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthWriteEnable);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setDepthWriteEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthWriteEnable, valuePointer, sizeof(o->depthWriteEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthCompareOp);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setDepthCompareOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthCompareOp, valuePointer, sizeof(o->depthCompareOp));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBoundsTestEnable);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setDepthBoundsTestEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBoundsTestEnable, valuePointer, sizeof(o->depthBoundsTestEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stencilTestEnable);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setStencilTestEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stencilTestEnable, valuePointer, sizeof(o->stencilTestEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getFrontNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->front);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setFrontNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->front, valuePointer, sizeof(o->front));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getBackNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->back);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setBackNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->back, valuePointer, sizeof(o->back));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getMinDepthBoundsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDepthBounds);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setMinDepthBoundsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDepthBounds, valuePointer, sizeof(o->minDepthBounds));
}

jlong Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBoundsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDepthBounds);
}

void Java_cz_mg_vulkan_VkPipelineDepthStencilStateCreateInfo_setMaxDepthBoundsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDepthBounds, valuePointer, sizeof(o->maxDepthBounds));
}


