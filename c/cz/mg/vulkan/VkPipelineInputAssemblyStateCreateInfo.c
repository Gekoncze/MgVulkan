#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineInputAssemblyStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_getTopology(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->topology));
}

void Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_setTopology(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->topology, jniLongToPointer(valueAddress), sizeof(o->topology));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_getPrimitiveRestartEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->primitiveRestartEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineInputAssemblyStateCreateInfo_setPrimitiveRestartEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineInputAssemblyStateCreateInfo* o = (VkPipelineInputAssemblyStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->primitiveRestartEnable, jniLongToPointer(valueAddress), sizeof(o->primitiveRestartEnable));
}

