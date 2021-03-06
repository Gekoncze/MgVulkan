#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineVertexInputDivisorStateCreateInfoEXT);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineVertexInputDivisorStateCreateInfoEXT));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_getVertexBindingDivisorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexBindingDivisorCount);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_setVertexBindingDivisorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexBindingDivisorCount, valuePointer, sizeof(o->vertexBindingDivisorCount));
}

jlong Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_getPVertexBindingDivisorsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pVertexBindingDivisors);
}

void Java_cz_mg_vulkan_VkPipelineVertexInputDivisorStateCreateInfoEXT_setPVertexBindingDivisorsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineVertexInputDivisorStateCreateInfoEXT* o = (VkPipelineVertexInputDivisorStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pVertexBindingDivisors, &valuePointer, sizeof(o->pVertexBindingDivisors));
}


