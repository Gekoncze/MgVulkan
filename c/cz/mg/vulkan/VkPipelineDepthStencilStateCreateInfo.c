#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDepthStencilStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthTestEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthTestEnable, valuePointer, sizeof(o->depthTestEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthWriteEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthWriteEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthWriteEnable, valuePointer, sizeof(o->depthWriteEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthCompareOp);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthCompareOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthCompareOp, valuePointer, sizeof(o->depthCompareOp));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBoundsTestEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthBoundsTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBoundsTestEnable, valuePointer, sizeof(o->depthBoundsTestEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stencilTestEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setStencilTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stencilTestEnable, valuePointer, sizeof(o->stencilTestEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getFront(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->front);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setFront(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->front, valuePointer, sizeof(o->front));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getBack(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->back);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setBack(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->back, valuePointer, sizeof(o->back));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDepthBounds);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setMinDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDepthBounds, valuePointer, sizeof(o->minDepthBounds));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDepthBounds);
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setMaxDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDepthBounds, valuePointer, sizeof(o->maxDepthBounds));
}


