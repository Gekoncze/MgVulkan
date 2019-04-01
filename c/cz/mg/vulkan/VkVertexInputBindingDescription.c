#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkVertexInputBindingDescription);
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_getBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_setBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_getStride(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->stride);
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_setStride(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stride, valuePointer, sizeof(o->stride));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_getInputRate(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->inputRate);
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDescription_setInputRate(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDescription* o = (VkVertexInputBindingDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inputRate, valuePointer, sizeof(o->inputRate));
}


