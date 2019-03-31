#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
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
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthTestEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthTestEnable, jniLongToPointer(valueAddress), sizeof(o->depthTestEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthWriteEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthWriteEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthWriteEnable, jniLongToPointer(valueAddress), sizeof(o->depthWriteEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthCompareOp));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthCompareOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthCompareOp, jniLongToPointer(valueAddress), sizeof(o->depthCompareOp));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBoundsTestEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setDepthBoundsTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthBoundsTestEnable, jniLongToPointer(valueAddress), sizeof(o->depthBoundsTestEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stencilTestEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setStencilTestEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->stencilTestEnable, jniLongToPointer(valueAddress), sizeof(o->stencilTestEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getFront(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->front));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setFront(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->front, jniLongToPointer(valueAddress), sizeof(o->front));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getBack(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->back));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setBack(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->back, jniLongToPointer(valueAddress), sizeof(o->back));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minDepthBounds));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setMinDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->minDepthBounds, jniLongToPointer(valueAddress), sizeof(o->minDepthBounds));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDepthBounds));
}

void Java_cz_mg_vulkan_vk_VkPipelineDepthStencilStateCreateInfo_setMaxDepthBounds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDepthStencilStateCreateInfo* o = (VkPipelineDepthStencilStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->maxDepthBounds, jniLongToPointer(valueAddress), sizeof(o->maxDepthBounds));
}

