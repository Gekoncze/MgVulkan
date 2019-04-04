package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtensionProperties.html">khronos documentation</a>
 **/
public class VulkanExtensionProperties extends VulkanObject {
    public VulkanExtensionProperties(){
        super(new VkExtensionProperties());
    }

    public VulkanExtensionProperties(VkExtensionProperties vk){
        super(vk);
    }

    @Override
    public VkExtensionProperties getVk(){
        return (VkExtensionProperties) super.getVk();
    }

    public VulkanExtensionProperties(VulkanChar extensionName, VulkanUInt32 specVersion) {
        super(new VkExtensionProperties(extensionName.getVk(), specVersion.getVk()));
    }

    public VulkanChar getExtensionName() {
        return new VulkanChar(getVk().getExtensionName());
    }

    public void setExtensionName(VulkanChar extensionName) {
        getVk().setExtensionName(extensionName.getVk());
    }

    public VulkanUInt32 getSpecVersion() {
        return new VulkanUInt32(getVk().getSpecVersion());
    }

    public void setSpecVersion(VulkanUInt32 specVersion) {
        getVk().setSpecVersion(specVersion.getVk());
    }


    public static class Array extends VulkanExtensionProperties implements cz.mg.collections.array.ReadonlyArray<VulkanExtensionProperties> {
        public Array(VkExtensionProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExtensionProperties.Array(count));
        }

        public Array(int count, VulkanExtensionProperties o){
            this(new VkExtensionProperties.Array(count, o.getVk()));
        }

        @Override
        public VkExtensionProperties.Array getVk(){
            return (VkExtensionProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExtensionProperties get(int i){
            return new VulkanExtensionProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExtensionProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExtensionProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkExtensionProperties.Pointer(value));
        }

        @Override
        public VkExtensionProperties.Pointer getVk(){
            return (VkExtensionProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanExtensionProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExtensionProperties.Pointer> {
            public Array(int count) {
                super(new VkExtensionProperties.Pointer.Array(count));
            }

            public Array(VulkanExtensionProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExtensionProperties.Pointer.Array getVk(){
                return (VkExtensionProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExtensionProperties.Pointer get(int i){
                return new VulkanExtensionProperties.Pointer(getVk().get(i));
            }
        }
    }
}
