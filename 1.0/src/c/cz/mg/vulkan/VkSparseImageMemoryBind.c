#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageMemoryBind);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSparseImageMemoryBind));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->subresource);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subresource, valuePointer, sizeof(o->subresource));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getMemoryNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->memory);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setMemoryNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memory, valuePointer, sizeof(o->memory));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getMemoryOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryOffset);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setMemoryOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryOffset, valuePointer, sizeof(o->memoryOffset));
}

jlong Java_cz_mg_vulkan_VkSparseImageMemoryBind_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSparseImageMemoryBind_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}


