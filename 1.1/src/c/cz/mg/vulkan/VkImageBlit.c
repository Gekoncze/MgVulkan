#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageBlit_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageBlit);
}

void Java_cz_mg_vulkan_VkImageBlit_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImageBlit));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getSrcSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubresource);
}

void Java_cz_mg_vulkan_VkImageBlit_setSrcSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubresource, valuePointer, sizeof(o->srcSubresource));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getSrcOffsetsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(o->srcOffsets);
}

void Java_cz_mg_vulkan_VkImageBlit_setSrcOffsetsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->srcOffsets, valuePointer, sizeof(o->srcOffsets));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getDstSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubresource);
}

void Java_cz_mg_vulkan_VkImageBlit_setDstSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubresource, valuePointer, sizeof(o->dstSubresource));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getDstOffsetsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(o->dstOffsets);
}

void Java_cz_mg_vulkan_VkImageBlit_setDstOffsetsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->dstOffsets, valuePointer, sizeof(o->dstOffsets));
}


