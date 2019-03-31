#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkShaderModuleCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_getCodeSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->codeSize));
}

void Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_setCodeSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    memcpy(&o->codeSize, jniLongToPointer(valueAddress), sizeof(o->codeSize));
}
jlong Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_getPCode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pCode));
}

void Java_cz_mg_vulkan_vk_VkShaderModuleCreateInfo_setPCode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkShaderModuleCreateInfo* o = (VkShaderModuleCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pCode, jniLongToPointer(valueAddress), sizeof(o->pCode));
}

