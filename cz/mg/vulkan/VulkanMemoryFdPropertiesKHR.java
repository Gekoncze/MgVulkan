package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryFdPropertiesKHR.html">khronos documentation</a>
 **/
public class VulkanMemoryFdPropertiesKHR extends VulkanObject {
    public VulkanMemoryFdPropertiesKHR(){
        super(new VkMemoryFdPropertiesKHR());
    }

    public VulkanMemoryFdPropertiesKHR(VkMemoryFdPropertiesKHR vk){
        super(vk);
    }

    @Override
    public VkMemoryFdPropertiesKHR getVk(){
        return (VkMemoryFdPropertiesKHR) super.getVk();
    }

    public VulkanMemoryFdPropertiesKHR(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 memoryTypeBits) {
        super(new VkMemoryFdPropertiesKHR(sType.getVk(), pNext.getVk(), memoryTypeBits.getVk()));
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

    public VulkanUInt32 getMemoryTypeBits() {
        return new VulkanUInt32(getVk().getMemoryTypeBits());
    }

    public void setMemoryTypeBits(VulkanUInt32 memoryTypeBits) {
        getVk().setMemoryTypeBits(memoryTypeBits.getVk());
    }


    public static class Array extends VulkanMemoryFdPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryFdPropertiesKHR> {
        public Array(VkMemoryFdPropertiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryFdPropertiesKHR.Array(count));
        }

        public Array(int count, VulkanMemoryFdPropertiesKHR o){
            this(new VkMemoryFdPropertiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryFdPropertiesKHR.Array getVk(){
            return (VkMemoryFdPropertiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryFdPropertiesKHR get(int i){
            return new VulkanMemoryFdPropertiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryFdPropertiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryFdPropertiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryFdPropertiesKHR.Pointer(value));
        }

        @Override
        public VkMemoryFdPropertiesKHR.Pointer getVk(){
            return (VkMemoryFdPropertiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryFdPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryFdPropertiesKHR.Pointer> {
            public Array(int count) {
                super(new VkMemoryFdPropertiesKHR.Pointer.Array(count));
            }

            public Array(VulkanMemoryFdPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryFdPropertiesKHR.Pointer.Array getVk(){
                return (VkMemoryFdPropertiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryFdPropertiesKHR.Pointer get(int i){
                return new VulkanMemoryFdPropertiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
