#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkVertexInputAttributeDescription);
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_getLocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->location);
}

void Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_setLocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->location, valuePointer, sizeof(o->location));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_getBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->binding);
}

void Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_setBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->binding, valuePointer, sizeof(o->binding));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_vk_VkVertexInputAttributeDescription_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkVertexInputAttributeDescription* o = (VkVertexInputAttributeDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}


