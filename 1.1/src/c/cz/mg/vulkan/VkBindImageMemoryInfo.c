#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBindImageMemoryInfo);
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkBindImageMemoryInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkBindImageMemoryInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkBindImageMemoryInfo_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_getMemory(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->memory);
}

void Java_cz_mg_vulkan_VkBindImageMemoryInfo_setMemory(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memory, valuePointer, sizeof(o->memory));
}

jlong Java_cz_mg_vulkan_VkBindImageMemoryInfo_getMemoryOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryOffset);
}

void Java_cz_mg_vulkan_VkBindImageMemoryInfo_setMemoryOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBindImageMemoryInfo* o = (VkBindImageMemoryInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryOffset, valuePointer, sizeof(o->memoryOffset));
}


