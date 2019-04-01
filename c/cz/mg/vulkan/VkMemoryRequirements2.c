#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryRequirements2);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryRequirements2_getMemoryRequirements(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryRequirements);
}

void Java_cz_mg_vulkan_vk_VkMemoryRequirements2_setMemoryRequirements(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryRequirements2* o = (VkMemoryRequirements2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryRequirements, valuePointer, sizeof(o->memoryRequirements));
}


