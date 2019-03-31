#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTableEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableEntryNVX* o = (VkObjectTableEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkObjectTableEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableEntryNVX* o = (VkObjectTableEntryNVX*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableEntryNVX* o = (VkObjectTableEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkObjectTableEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableEntryNVX* o = (VkObjectTableEntryNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}

