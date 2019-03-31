#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDrawIndirectCommand);
}

jlong Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_getVertexCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->vertexCount));
}

void Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_setVertexCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->vertexCount, jniLongToPointer(valueAddress), sizeof(o->vertexCount));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_getInstanceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->instanceCount));
}

void Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_setInstanceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->instanceCount, jniLongToPointer(valueAddress), sizeof(o->instanceCount));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_getFirstVertex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->firstVertex));
}

void Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_setFirstVertex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->firstVertex, jniLongToPointer(valueAddress), sizeof(o->firstVertex));
}
jlong Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_getFirstInstance(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->firstInstance));
}

void Java_cz_mg_vulkan_vk_VkDrawIndirectCommand_setFirstInstance(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndirectCommand* o = (VkDrawIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->firstInstance, jniLongToPointer(valueAddress), sizeof(o->firstInstance));
}

