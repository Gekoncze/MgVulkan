#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkVertexInputBindingDivisorDescriptionEXT);
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_getBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_setBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_getDivisor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->divisor);
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_setDivisor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->divisor, valuePointer, sizeof(o->divisor));
}


