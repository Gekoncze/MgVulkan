#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorBufferInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorBufferInfo);
}

jlong Java_cz_mg_vulkan_VkDescriptorBufferInfo_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkDescriptorBufferInfo_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}

jlong Java_cz_mg_vulkan_VkDescriptorBufferInfo_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkDescriptorBufferInfo_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkDescriptorBufferInfo_getRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->range);
}

void Java_cz_mg_vulkan_VkDescriptorBufferInfo_setRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorBufferInfo* o = (VkDescriptorBufferInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->range, valuePointer, sizeof(o->range));
}


