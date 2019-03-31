#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemoryInfo);
}

jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->image));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    memcpy(&o->image, jniLongToPointer(valueAddress), sizeof(o->image));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memory));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    memcpy(&o->memory, jniLongToPointer(valueAddress), sizeof(o->memory));
}
jlong Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_getMemoryOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryOffset));
}

void Java_cz_mg_vulkan_vk_VkBindImageMemoryInfo_setMemoryOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    memcpy(&o->memoryOffset, jniLongToPointer(valueAddress), sizeof(o->memoryOffset));
}

