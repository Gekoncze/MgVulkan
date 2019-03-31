#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
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
    return jniPointerToLong(&(o->binding));
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_setBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    memcpy(&o->binding, jniLongToPointer(valueAddress), sizeof(o->binding));
}
jlong Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_getDivisor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->divisor));
}

void Java_cz_mg_vulkan_vk_VkVertexInputBindingDivisorDescriptionEXT_setDivisor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    memcpy(&o->divisor, jniLongToPointer(valueAddress), sizeof(o->divisor));
}

