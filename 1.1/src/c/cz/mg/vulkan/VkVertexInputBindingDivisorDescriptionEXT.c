#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkVertexInputBindingDivisorDescriptionEXT);
}

void Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkVertexInputBindingDivisorDescriptionEXT));
}

jlong Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_getBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_setBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_getDivisorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->divisor);
}

void Java_cz_mg_vulkan_VkVertexInputBindingDivisorDescriptionEXT_setDivisorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputBindingDivisorDescriptionEXT* o = (VkVertexInputBindingDivisorDescriptionEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->divisor, valuePointer, sizeof(o->divisor));
}


