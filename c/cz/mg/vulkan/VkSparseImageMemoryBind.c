#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageMemoryBind);
}

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subresource));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->subresource, jniLongToPointer(valueAddress), sizeof(o->subresource));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extent));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->extent, jniLongToPointer(valueAddress), sizeof(o->extent));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memory));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->memory, jniLongToPointer(valueAddress), sizeof(o->memory));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getMemoryOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryOffset));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setMemoryOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->memoryOffset, jniLongToPointer(valueAddress), sizeof(o->memoryOffset));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBind_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBind* o = (VkSparseImageMemoryBind*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}

