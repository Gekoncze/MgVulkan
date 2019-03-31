#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSparseImageMemoryBindInfo);
}

jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->image));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    memcpy(&o->image, jniLongToPointer(valueAddress), sizeof(o->image));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_getBindCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bindCount));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_setBindCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    memcpy(&o->bindCount, jniLongToPointer(valueAddress), sizeof(o->bindCount));
}
jlong Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_getPBinds(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pBinds));
}

void Java_cz_mg_vulkan_vk_VkSparseImageMemoryBindInfo_setPBinds(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSparseImageMemoryBindInfo* o = (VkSparseImageMemoryBindInfo*)jniLongToPointer(address);
    memcpy(&o->pBinds, jniLongToPointer(valueAddress), sizeof(o->pBinds));
}

