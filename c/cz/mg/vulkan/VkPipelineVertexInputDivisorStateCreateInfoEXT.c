#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineVertexInputDivisorStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_getVertexBindingDivisorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexBindingDivisorCount);
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_setVertexBindingDivisorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexBindingDivisorCount, valuePointer, sizeof(o->vertexBindingDivisorCount));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_getPVertexBindingDivisors(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pVertexBindingDivisors);
}

void Java_cz_mg_vulkan_vk_VkPipelineVertexInputDivisorStateCreateInfoEXT_setPVertexBindingDivisors(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pVertexBindingDivisors, &valuePointer, sizeof(o->pVertexBindingDivisors));
}


