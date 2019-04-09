#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkImageBlit_getSrcSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubresource);
}

void Java_cz_mg_vulkan_VkImageBlit_setSrcSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubresource, valuePointer, sizeof(o->srcSubresource));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getSrcOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(o->srcOffsets);
}

void Java_cz_mg_vulkan_VkImageBlit_setSrcOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->srcOffsets, valuePointer, sizeof(o->srcOffsets));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getDstSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubresource);
}

void Java_cz_mg_vulkan_VkImageBlit_setDstSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubresource, valuePointer, sizeof(o->dstSubresource));
}

jlong Java_cz_mg_vulkan_VkImageBlit_getDstOffsets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    return jniPointerToLong(o->dstOffsets);
}

void Java_cz_mg_vulkan_VkImageBlit_setDstOffsets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageBlit* o = (VkImageBlit*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->dstOffsets, valuePointer, sizeof(o->dstOffsets));
}


