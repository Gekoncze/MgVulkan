package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateInfo.html">khronos documentation</a>
 **/
public class VulkanDeviceCreateInfo extends VulkanObject {
    public VulkanDeviceCreateInfo(){
        super(new VkDeviceCreateInfo());
    }

    public VulkanDeviceCreateInfo(VkDeviceCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceCreateInfo getVk(){
        return (VkDeviceCreateInfo) super.getVk();
    }
    public VulkanDeviceCreateInfo(VulkanObject pNext, VulkanDeviceCreateFlags flags, VulkanUInt32 queueCreateInfoCount, VulkanDeviceQueueCreateInfo pQueueCreateInfos, VulkanUInt32 enabledLayerCount, VulkanChar.Pointer ppEnabledLayerNames, VulkanUInt32 enabledExtensionCount, VulkanChar.Pointer ppEnabledExtensionNames, VulkanPhysicalDeviceFeatures pEnabledFeatures) {
        super(new VkDeviceCreateInfo(pNext.getVk(), flags.getVk(), queueCreateInfoCount.getVk(), pQueueCreateInfos.getVk(), enabledLayerCount.getVk(), ppEnabledLayerNames.getVk(), enabledExtensionCount.getVk(), ppEnabledExtensionNames.getVk(), pEnabledFeatures.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanDeviceCreateFlags getFlags() {
        return new VulkanDeviceCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDeviceCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getQueueCreateInfoCount() {
        return new VulkanUInt32(getVk().getQueueCreateInfoCount());
    }

    public void setQueueCreateInfoCount(VulkanUInt32 queueCreateInfoCount) {
        getVk().setQueueCreateInfoCount(queueCreateInfoCount.getVk());
    }

    public VulkanDeviceQueueCreateInfo getPQueueCreateInfos() {
        return new VulkanDeviceQueueCreateInfo(getVk().getPQueueCreateInfos());
    }

    public void setPQueueCreateInfos(VulkanDeviceQueueCreateInfo pQueueCreateInfos) {
        getVk().setPQueueCreateInfos(pQueueCreateInfos.getVk());
    }

    public VulkanUInt32 getEnabledLayerCount() {
        return new VulkanUInt32(getVk().getEnabledLayerCount());
    }

    public void setEnabledLayerCount(VulkanUInt32 enabledLayerCount) {
        getVk().setEnabledLayerCount(enabledLayerCount.getVk());
    }

    public VulkanChar.Pointer getPpEnabledLayerNames() {
        return new VulkanChar.Pointer(getVk().getPpEnabledLayerNames());
    }

    public void setPpEnabledLayerNames(VulkanChar.Pointer ppEnabledLayerNames) {
        getVk().setPpEnabledLayerNames(ppEnabledLayerNames.getVk());
    }

    public VulkanUInt32 getEnabledExtensionCount() {
        return new VulkanUInt32(getVk().getEnabledExtensionCount());
    }

    public void setEnabledExtensionCount(VulkanUInt32 enabledExtensionCount) {
        getVk().setEnabledExtensionCount(enabledExtensionCount.getVk());
    }

    public VulkanChar.Pointer getPpEnabledExtensionNames() {
        return new VulkanChar.Pointer(getVk().getPpEnabledExtensionNames());
    }

    public void setPpEnabledExtensionNames(VulkanChar.Pointer ppEnabledExtensionNames) {
        getVk().setPpEnabledExtensionNames(ppEnabledExtensionNames.getVk());
    }

    public VulkanPhysicalDeviceFeatures getPEnabledFeatures() {
        return new VulkanPhysicalDeviceFeatures(getVk().getPEnabledFeatures());
    }

    public void setPEnabledFeatures(VulkanPhysicalDeviceFeatures pEnabledFeatures) {
        getVk().setPEnabledFeatures(pEnabledFeatures.getVk());
    }


    public static class Array extends VulkanDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceCreateInfo> {
        public Array(VkDeviceCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceCreateInfo.Array(count));
        }

        public Array(int count, VulkanDeviceCreateInfo o){
            this(new VkDeviceCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceCreateInfo.Array getVk(){
            return (VkDeviceCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceCreateInfo get(int i){
            return new VulkanDeviceCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceCreateInfo.Pointer(value));
        }

        @Override
        public VkDeviceCreateInfo.Pointer getVk(){
            return (VkDeviceCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceCreateInfo.Pointer.Array getVk(){
                return (VkDeviceCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceCreateInfo.Pointer get(int i){
                return new VulkanDeviceCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
